/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logicalProgramsforArrays;

import java.util.Collections;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class ReverseStringArray {
    
    
    public static void main(String []args){
        String strArray[] = new String[]{"Sunday","Maonday","Tuesday","wednesday","Thursday","Freiday","Saturday"};
    List<String> strList = Arrays.asList(strArray);
    //strArray=(String[]) Arrays.sort(strArray);
    
        Collections.reverse(strList);
        
        strArray =(String[])strList.toArray();
        
        for(int i = 0; i< strArray.length;i++){
            System.out.println(strArray[i]);
            
        }
 
        
        
    }

}
