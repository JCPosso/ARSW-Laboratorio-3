package edu.eci.arsw.blueprints.test.persistence.impl;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.model.redundancyFilter;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class redundancyFilterTest {
    @Test
    public void filterRepeated() {
        redundancyFilter prueba = new redundancyFilter();
        Point points[] = {
                new Point(1,2),
                new Point(1,2),
                new Point(1,2),
                new Point(3,4),
                new Point(5,6),
                new Point(5,6),
                new Point(5,6),
                new Point(7,8),
                new Point(9,10)
        };
        Point otherPoints[] ={
                new Point(1,2),
                new Point(3,4),
                new Point(5,6),
                new Point(7,8),
                new Point(9,10)
        };
        Blueprint blueprint = new Blueprint("juan","jcposso",points);
        blueprint = prueba.filterPoints(blueprint);
        List<Point> res = blueprint.getPoints();
        for (int i = 0; i < res.size(); i++){
            assertEquals(otherPoints[i].toString(),res.get(i).toString());
        }
    }
}