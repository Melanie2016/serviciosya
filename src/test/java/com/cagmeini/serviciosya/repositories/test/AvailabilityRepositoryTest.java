package com.cagmeini.serviciosya.repositories.test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cagmeini.serviciosya.beans.entity.AvailabilityEntity;
import com.cagmeini.serviciosya.beans.entity.CityEntity;
import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.OccupationEntity;
import com.cagmeini.serviciosya.beans.entity.ProviderEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
import com.cagmeini.serviciosya.dao.repositories.IAvailabilityRepository;
import com.cagmeini.serviciosya.dao.repositories.ICityRepository;
import com.cagmeini.serviciosya.dao.repositories.ICountryRepository;
import com.cagmeini.serviciosya.dao.repositories.IOccupationRepository;
import com.cagmeini.serviciosya.dao.repositories.IProviderRepository;
import com.cagmeini.serviciosya.dao.repositories.IProvinceRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE , classes = JpaConfiguration.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvailabilityRepositoryTest {
	
	@Autowired
	private ICountryRepository repositoryCountry = null;
	
	@Autowired
	private IProvinceRepository repositoryProvince = null;
	
	@Autowired
	private ICityRepository repositoryCity = null;
	
	@Autowired
	private IAvailabilityRepository repositoryAvailability = null;
	
	@Autowired
	private IOccupationRepository repositoryOccupation = null;
	
	@Autowired
	private IProviderRepository repositoryProvider = null;
	
	
	
	
	
	
	private final Logger logger = LoggerFactory.getLogger (CityRepositoryTest.class);
	
	
	
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
        logger.debug (String.format ("Objects provinces created %s", Arrays.toString (provinces)));

        logger.debug ("Saving provinces...");
        this.repositoryProvince.save (Arrays.asList (provinces));



        // ------------------ GUARDANDO CIUDADES ----------------------


        logger.info ("Creating citys...");
        CityEntity[] cityList = new CityEntity [] {

                new CityEntity (Integer.valueOf (9),this.repositoryProvince.getOne(6),"Caballito"),
                new CityEntity (Integer.valueOf (10),this.repositoryProvince.getOne(6),"San Justo"),
                new CityEntity (Integer.valueOf (11),this.repositoryProvince.getOne(6),"Moron"),
                new CityEntity (Integer.valueOf (12),this.repositoryProvince.getOne(6),"Castelar"),
                new CityEntity (Integer.valueOf (13),this.repositoryProvince.getOne(6),"Ituzaingo"),
        };
        logger.debug (String.format ("Objects city created %s", Arrays.toString (cityList)));

        logger.debug ("Saving city...");
        this.repositoryCity.save (Arrays.asList (cityList));
        logger.debug (String.format ("City saved %s", Arrays.toString (cityList)));
        
        
        
        
        
        
        // ------------------- GUARDANDO PROVEEDORES -------------------
        ProviderEntity p1 =  new ProviderEntity(Integer.valueOf (14),"Zoe"	,"Gomez","1111111",1111111,"zoe.lala@lala.com","jaja 123",this.repositoryCity.getOne(11));
        ProviderEntity p2 =  new ProviderEntity(Integer.valueOf (15),"Isabel"	,"Lopez","2222222",2222222,"isa.lala@lala.com","jaja 123",this.repositoryCity.getOne(11));
        ProviderEntity p3 =  new ProviderEntity(Integer.valueOf (16),"Paola"	,"Mende","1231556",12345678,"pao.lala@lala.com","jaja 123",this.repositoryCity.getOne(11));
        
        
        
        logger.info ("Creating providers...");
        ProviderEntity[] providers = new ProviderEntity [] {p1,p2,p3};
        
        
        logger.debug (String.format ("Objects providers created %s", Arrays.toString (providers)));

        logger.info ("Saving providers !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!...");
        this.repositoryProvider.save(Arrays.asList(providers));

        
        

		// ------------------ GUARDANDO OCCUPACIONES ----------------------
        logger.info ("Creating occupations...");
        OccupationEntity[] occupations = new OccupationEntity [] {

                new OccupationEntity (Integer.valueOf (17),"Developer"	,"Ninja code"	,null),
                new OccupationEntity (Integer.valueOf (18),"Comediante"	,"Hacer reir"	,null),
                new OccupationEntity (Integer.valueOf (19),"Cantante"	,"Cantar"		,null),
               
        };
        
        logger.debug (String.format ("Objects occupations created %s", Arrays.toString (occupations)));

        logger.debug ("Saving occupations...");
        this.repositoryOccupation.save (Arrays.asList (occupations));
        
        
        
        // ------------------- PREPARAR LOS SET PARA INGRESAR  -------------------
        
        Set<OccupationEntity> occupationSet = new HashSet<OccupationEntity>(Arrays.asList(occupations));
        
        Set<ProviderEntity> providerSet = new HashSet<ProviderEntity>(Arrays.asList(providers));
        
        
		
		// ------------------- GUARDANDO DISPONIBILIDADES  -------------------
        logger.info ("Creating availabilities...");
        AvailabilityEntity[] availabilities = new AvailabilityEntity [] {

                new AvailabilityEntity(Integer.valueOf (20),LocalTime.parse("08:30"),LocalTime.parse("13:30"),"Lunes"		,occupationSet,providerSet	),
                new AvailabilityEntity(Integer.valueOf (21),LocalTime.parse("11:30"),LocalTime.parse("16:30"),"Martes"		,occupationSet,providerSet	),
                new AvailabilityEntity(Integer.valueOf (22),LocalTime.parse("08:30"),LocalTime.parse("13:30"),"Miercoles"	,occupationSet,providerSet	)
         
        };
        
        logger.debug (String.format ("Objects availability created %s", Arrays.toString (availabilities)));

        logger.debug ("Saving availabilities...");
        this.repositoryAvailability.save (Arrays.asList (availabilities));
        
        
        

    }

	
	
//	@Test
//    public void testFindOneAvailabilityByDay(){
//
//        
//
//        AvailabilityEntity a = this.repositoryA.findOneAvailabilityEntityByDayOfAttention("Lunes");
//
//        Assert.assertEquals(a.getDayOfAttention(),"Lunes");
//
//    }
//	
	
	@Test
	public void testAllAvailability() {
		
		
		List<AvailabilityEntity> list = this.repositoryAvailability.findAll();
		
		Assert.assertNotNull(list.isEmpty());
		
	}
	
}
