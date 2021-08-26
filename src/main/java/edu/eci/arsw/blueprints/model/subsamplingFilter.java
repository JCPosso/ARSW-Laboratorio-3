/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.model;

import edu.eci.arsw.blueprints.persistence.impl.Tuple;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Home
 */
public class subsamplingFilter implements Filter{

    @Override
    public Set<Blueprint> filterPoints(Set<Blueprint> bps) {
        Set ans = new HashSet();
        for(Blueprint bp : bps){
                List<Point> origins = bp.getPoints();
                List<Point> news = new ArrayList();
                for(int i=0;i<origins.size();i++){
                    if(i%2==0) news.add(origins.get(i));
                }
                ans.add(new Blueprint(bp.getAuthor(),bp.getName(),news));
                
        }
        
        return ans;
    }
    
    
}
