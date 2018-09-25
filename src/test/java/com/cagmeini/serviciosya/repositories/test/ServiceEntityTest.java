package com.cagmeini.serviciosya.repositories.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cagmeini.serviciosya.beans.entity.CityEntity;
import com.cagmeini.serviciosya.beans.entity.ConsumerEntity;
import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
import com.cagmeini.serviciosya.beans.entity.ServiceEntity;
import com.cagmeini.serviciosya.dao.repositories.ICityRepository;
import com.cagmeini.serviciosya.dao.repositories.IConsumerRepository;
import com.cagmeini.serviciosya.dao.repositories.ICountryRepository;
import com.cagmeini.serviciosya.dao.repositories.IProvinceRepository;
import com.cagmeini.serviciosya.dao.repositories.IServiceRepository;

@RunWith (SpringJUnit4ClassRunner.class)
@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.NONE , classes = JpaConfiguration.class)
@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class ServiceEntityTest {
	
    @Autowired
    private IProvinceRepository repositoryProvince = null;

    @Autowired
    private ICountryRepository repositoryCountry = null;

    @Autowired
    private ICityRepository repositoryCity = null;
	
    @Autowired
	private IConsumerRepository repositoryCon = null;
	
    @Autowired
	private IServiceRepository repositoryService = null;
	
	
	private final Logger logger = LoggerFactory.getLogger (ProvinceRepositoryTest.class);
	
	
	public ServiceEntityTest() {
		
	}
	
	
	@Before
    public void setup () {

		// ------------------ GUARDANDO PAISES ----------------------
        logger.info ("Creating countries...");
        CountryEntity[] countries = new CountryEntity [] {

                new CountryEntity (Integer.valueOf (1), "ar", "Argentina"),
                new CountryEntity (Integer.valueOf (2), "ve", "Venezuela"),
                new CountryEntity (Integer.valueOf (3), "uy", "Uruguay"),
                new CountryEntity (Integer.valueOf (4), "cl", "Chile"),
                new CountryEntity (Integer.valueOf (5), "pe", "Peru")
        };
        logger.debug (String.format ("Objects country created %s", Arrays.toString (countries)));

        logger.debug ("Saving countries...");
        this.repositoryCountry.save (Arrays.asList (countries));


        // ------------------- GUARDANDO PROVINCIAS -------------------
        logger.info ("Creating provinces...");
        ProvinceEntity[] provinces = new ProvinceEntity [] {

                new ProvinceEntity(Integer.valueOf (6),"Buenos Aires", this.repositoryCountry.getOne(1)),
                new ProvinceEntity(Integer.valueOf (7),"Misiones",this.repositoryCountry.getOne(1)),
                new ProvinceEntity(Integer.valueOf (8),"Cordoba",this.repositoryCountry.getOne(1)),
        };
        logger.debug (String.format ("Objects provinces created %s", Arrays.toString (countries)));

        logger.debug ("Saving provinces...");
        this.repositoryProvince.save (Arrays.asList (provinces));



        // ------------------ GUARDANDO CIUDADES ----------------------


        logger.info ("Creating citys...");
        CityEntity[] cities = new CityEntity [] {

                new CityEntity (Integer.valueOf (9),this.repositoryProvince.getOne(6),"Caballito"),
                new CityEntity (Integer.valueOf (10),this.repositoryProvince.getOne(6),"San Justo"),
                new CityEntity (Integer.valueOf (11),this.repositoryProvince.getOne(6),"Moron"),
                new CityEntity (Integer.valueOf (12),this.repositoryProvince.getOne(6),"Castelar"),
                new CityEntity (Integer.valueOf (13),this.repositoryProvince.getOne(6),"Ituzaingo"),
        };
        logger.debug (String.format ("Objects city created %s", Arrays.toString (cities)));

        logger.debug ("Saving city...");
        this.repositoryCity.save (Arrays.asList (cities));
        logger.debug (String.format ("City saved %s", Arrays.toString (cities)));
        
        
        
		// ------------------ GUARDANDO CONSUMER ----------------------
        logger.info ("Creating consumers...");
        ConsumerEntity[] consumers = new ConsumerEntity [] {

                new ConsumerEntity (Integer.valueOf (14), "Isabel", "Gomez","11111111",11111111,"isabel.lala@lalal.com","lala 123",cities[1]),
                new ConsumerEntity (Integer.valueOf (15), "Cacho" , "Lopez","22222222",22222222,"cacho.lala@lalal.com","lele 123",cities[0])
        };
        logger.debug (String.format ("Objects consumer created %s", Arrays.toString (consumers)));
        
        logger.debug ("Saving consumers...");
        this.repositoryCon.save (Arrays.asList (consumers));
        logger.debug (String.format ("Consumers saved %s", Arrays.toString (consumers)));

        
//        DateUtil date = new DateUtil();
//        date.asDate(LocalDate.of(2018, 05, 2));
        
        // buscar como parsear un LocalDate
        logger.info ("Creating services...");
        ServiceEntity[] services = new ServiceEntity [] {

                new ServiceEntity (Integer.valueOf (16),LocalDate.of(2018, 05, 2), LocalTime.parse("08:30"), consumers[0]),
                new ServiceEntity (Integer.valueOf (17),LocalDate.of(2018, 05, 2), LocalTime.parse("09:30"), consumers[1]),
                new ServiceEntity (Integer.valueOf (18),LocalDate.of(2018, 05, 3), LocalTime.parse("09:00"), consumers[0]),
                new ServiceEntity (Integer.valueOf (19),LocalDate.of(2018, 05, 4), LocalTime.parse("08:30"), consumers[1])
        };
        logger.debug (String.format ("Objects services created %s", Arrays.toString (services)));

        
        logger.debug ("Saving services...");
        this.repositoryService.save (Arrays.asList (services));
        logger.debug (String.format ("Services saved %s", Arrays.toString (services)));
        
        	
    }
	
	
	@Test
	@Transactional @Rollback
	public void tesGetAllServices() {

        List<ServiceEntity> list = this.repositoryService.findAll();

        Assert.assertNotNull ("There are provinces...", list);
	}
	
	
	@Test
	@Transactional @Rollback
	public void testServiceById() {
		
		
		ServiceEntity service = this.repositoryService.findOneById(17);
		
		Assert.assertNotNull(service);
	}
	
	
//	@Test
//	@Transactional @Rollback
//	public void testServiceByConsumerId() {
//		
//		
//		
//		ServiceEntity service = this.repositoryService.findServiceByConsumerEntityId();	
//		
//		Assert.assertNotNull(service);
//	}

}
