package com.f22pkj31.crud.test;

import com.f22pkj31.crud.dao.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    CourseMapper courseMapper;

    @Test
    public void testCRUD(){
        System.out.println(courseMapper);
    }

}
