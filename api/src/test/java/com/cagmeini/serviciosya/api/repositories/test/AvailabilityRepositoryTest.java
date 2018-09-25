package com.cagmeini.serviciosya.api.repositories.test;

import java.time.LocalTime;
import java.util.ArrayList;
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
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cagmeini.serviciosya.api.beans.entity.AvailabilityEntity;
import com.cagmeini.serviciosya.api.beans.entity.CityEntity;
import com.cagmeini.serviciosya.api.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.api.beans.entity.OccupationEntity;
import com.cagmeini.serviciosya.api.beans.entity.ProviderEntity;
import com.cagmeini.serviciosya.api.beans.entity.ProvinceEntity;
import com.cagmeini.serviciosya.api.dao.repositories.IAvailabilityRepository;
import com.cagmeini.serviciosya.api.dao.repositories.ICityRepository;
import com.cagmeini.serviciosya.api.dao.repositories.IOccupationRepository;
import com.cagmeini.serviciosya.api.dao.repositories.IProviderRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE , classes = JpaConfiguration.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvailabilityRepositoryTest {
	
	private ICityRepository repositoryCity = null;

	private IAvailabilityRepository repositoryA = null;
	
	private IOccupationRepository repositoryOcc = null;
	
	private IProviderRepository repositoryP = null;
	
	private final Logger logger = LoggerFactory.getLogger (CityRepositoryTest.class);
	
	
	
	@Before
    public void setup () {

        // ------------------ GUARDANDO CIUDADES ----------------------


        logger.info ("Creating citys...");
        CityEntity[] cityList = new CityEntity [] {

                new CityEntity (Integer.valueOf (1),null,"Caballito"),
                new CityEntity (Integer.valueOf (2),null,"San Justo"),
                new CityEntity (Integer.valueOf (3),null,"Moron"),
                new CityEntity (Integer.valueOf (4),null,"Castelar"),
                new CityEntity (Integer.valueOf (5),null,"Ituzaingo"),
        };
        logger.debug (String.format ("Objects city created %s", Arrays.toString (cityList)));

        logger.debug ("Saving city...");
        this.repositoryCity.save (Arrays.asList (cityList));
        logger.debug (String.format ("City saved %s", Arrays.toString (cityList)));


        Set<CityEntity> citySet = new HashSet<CityEntity>(Arrays.asList(cityList));
		
        // ------------------- GUARDANDO PROVEEDORES -------------------
        logger.info ("Creating providers...");
        ProviderEntity[] providers = new ProviderEntity [] {

                new ProviderEntity(Integer.valueOf (6),"Zoe"	,"Gomez","1111111",1111111,"zoe.lala@lala.com","jaja 123",this.repositoryCity.getOne(1)),
                new ProviderEntity(Integer.valueOf (7),"Isabel"	,"Lopez","2222222",2222222,"isa.lala@lala.com","jaja 123",this.repositoryCity.getOne(3)),
                new ProviderEntity(Integer.valueOf (8),"Paola"	,"Mende","1231556",12345678,"pao.lala@lala.com","jaja 123",this.repositoryCity.getOne(2)),
        };
        logger.debug (String.format ("Objects providers created %s", Arrays.toString (providers)));

        logger.info ("Saving providers !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!...");
        this.repositoryP.save(Arrays.asList(providers));




		// ------------------ GUARDANDO OCCUPACIONES ----------------------
        logger.info ("Creating occupations...");
        OccupationEntity[] occupations = new OccupationEntity [] {

                new OccupationEntity (Integer.valueOf (9),"Developer"	,"Ninja code"	,null),
                new OccupationEntity (Integer.valueOf (10),"Comediante"	,"Hacer reir"	,null),
                new OccupationEntity (Integer.valueOf (11),"Cantante"	,"Cantar"		,null),
               
        };
        
        logger.debug (String.format ("Objects occupations created %s", Arrays.toString (occupations)));

        logger.debug ("Saving occupations...");
        this.repositoryOcc.save (Arrays.asList (occupations));
        
        
        
        // ------------------- PREPARAR LOS SET PARA INGRESAR  -------------------
        
        Set<OccupationEntity> occupationSet = new HashSet<OccupationEntity>(Arrays.asList(occupations));
        
        Set<ProviderEntity> providerSet = new HashSet<ProviderEntity>(Arrays.asList(providers));
        
        
		
		// ------------------- GUARDANDO DISPONIBILIDADES  -------------------
        logger.info ("Creating availabilities...");
        AvailabilityEntity[] availabilities = new AvailabilityEntity [] {

                new AvailabilityEntity(Integer.valueOf (12),LocalTime.parse("08:30"),LocalTime.parse("13:30"),"Lunes"		,occupationSet,providerSet	),
                new AvailabilityEntity(Integer.valueOf (13),LocalTime.parse("11:30"),LocalTime.parse("16:30"),"Martes"		,occupationSet,providerSet	),
                new AvailabilityEntity(Integer.valueOf (14),LocalTime.parse("08:30"),LocalTime.parse("13:30"),"Miercoles"	,occupationSet,providerSet	)
         
        };
        
        logger.debug (String.format ("Objects availability created %s", Arrays.toString (availabilities)));

        logger.debug ("Saving availabilities...");
        this.repositoryA.save (Arrays.asList (availabilities));
        
        
        

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
		
		
		List<AvailabilityEntity> list = this.repositoryA.findAll();
		
		Assert.assertNotNull(list.isEmpty());
		
	}
	
}
