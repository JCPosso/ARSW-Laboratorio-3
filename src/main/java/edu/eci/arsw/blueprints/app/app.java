/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.app;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Home
 */
public class app {
    
    
    public static void main(String[] args) throws BlueprintPersistenceException, BlueprintNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringContext.xml");
        BlueprintsServices service = ac.getBean(BlueprintsServices.class);
        //agregar blueprint
        Point[] pts=new Point[]{new Point(50, 140),new Point(50, 115)};
        Blueprint bp=new Blueprint("posso", "plano",pts);
        service.addNewBlueprint(bp);
        //cosultar blueprint
        System.out.println(service.getBlueprint("posso", "plano").toString());
        
        
        
    }
    
}
