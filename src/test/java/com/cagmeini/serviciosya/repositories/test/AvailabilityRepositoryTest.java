package com.cagmeini.serviciosya.repositories.test;

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

import com.cagmeini.serviciosya.beans.entity.AvailabilityEntity;
import com.cagmeini.serviciosya.beans.entity.CityEntity;
import com.cagmeini.serviciosya.beans.entity.CountryEntity;
import com.cagmeini.serviciosya.beans.entity.OccupationEntity;
import com.cagmeini.serviciosya.beans.entity.ProviderEntity;
import com.cagmeini.serviciosya.beans.entity.ProvinceEntity;
import com.cagmeini.serviciosya.dao.repositories.IAvailabilityRepository;
import com.cagmeini.serviciosya.dao.repositories.IOccupationRepository;
import com.cagmeini.serviciosya.dao.repositories.IProviderRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE , classes = JpaConfiguration.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AvailabilityRepositoryTest {
	
	
	private IAvailabilityRepository repositoryA = null;
	
	private IOccupationRepository repositoryOcc = null;
	
	private IProviderRepository repositoryP = null;
	
	private final Logger logger = LoggerFactory.getLogger (CityRepositoryTest.class);
	
	
	
	@Before
    public void setup () {

		
        // ------------------- GUARDANDO PROVEEDORES -------------------
        logger.info ("Creating providers...");
        ProviderEntity[] providers = new ProviderEntity [] {

                new ProviderEntity(Integer.valueOf (1),"Zoe"	,"Gomez","1111111",1111111,"zoe.lala@lala.com","jaja 123"),
                new ProviderEntity(Integer.valueOf (2),"Isabel"	,"Lopez","2222222",2222222,"isa.lala@lala.com","jaja 123"),
                new ProviderEntity(Integer.valueOf (3),"Paola"	,"Mende","1231556",12345678,"pao.lala@lala.com","jaja 123"),
        };
        logger.debug (String.format ("Objects providers created %s", Arrays.toString (providers)));

        logger.info ("Saving providers !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!...");
        this.repositoryP.save(Arrays.asList(providers));

        
        

		// ------------------ GUARDANDO OCCUPACIONES ----------------------
        logger.info ("Creating occupations...");
        OccupationEntity[] occupations = new OccupationEntity [] {

                new OccupationEntity (Integer.valueOf (4),"Developer"	,"Ninja code"	,null),
                new OccupationEntity (Integer.valueOf (5),"Comediante"	,"Hacer reir"	,null),
                new OccupationEntity (Integer.valueOf (6),"Cantante"	,"Cantar"		,null),
               
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

                new AvailabilityEntity(Integer.valueOf (7),LocalTime.parse("08:30"),LocalTime.parse("13:30"),"Lunes"		,occupationSet,providerSet	),
                new AvailabilityEntity(Integer.valueOf (8),LocalTime.parse("11:30"),LocalTime.parse("16:30"),"Martes"		,occupationSet,providerSet	),
                new AvailabilityEntity(Integer.valueOf (9),LocalTime.parse("08:30"),LocalTime.parse("13:30"),"Miercoles"	,occupationSet,providerSet	)
         
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
