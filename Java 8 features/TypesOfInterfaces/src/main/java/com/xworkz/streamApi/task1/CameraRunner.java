package com.xworkz.streamApi.task1;

import java.util.HashMap;
import java.util.Map;

public class CameraRunner {
    public static void main(String[] args) {

        Map<CameraDto, LensDto> map = new HashMap<>();

        CameraDto c1 = new CameraDto(101,"canon",55000);
        CameraDto c2 = new CameraDto(102,"Sony",72000);
        CameraDto c3 = new CameraDto(103,"Nikon",61000);
        CameraDto c4 = new CameraDto(104,"Fujifilm",68000);
        CameraDto c5 = new CameraDto(105,"Samsong",50000);

        LensDto l1 = new LensDto(1,"Wide angle",15000);
        LensDto l2 = new LensDto(2,"Telephoto",28000);
        LensDto l3 = new LensDto(3,"Macro",18000);
        LensDto l4 = new LensDto(4,"Prime",9000);
        LensDto l5 = new LensDto(5,"Fungo",10000);

        map.put(c1,l1);
        map.put(c2,l2);
        map.put(c3,l3);
        map.put(c4,l4);
        map.put(c5,l5);

        //put
        System.out.println("After put() :");
        System.out.println(map);

        //get
        System.out.println("get() :");
        System.out.println(map.get(c2));

        //containsKey
        System.out.println("Containskey() :");
        System.out.println(map.containsKey(c1));

        //contains Value
        System.out.println("ContainsVlue() :");
        System.out.println(map.containsValue(l2));

        //size
        System.out.println("Size():");
        System.out.println(map.size());

        //isEmpty
        System.out.println("isEmpty() :");
        System.out.println(map.isEmpty());

        //keySet
        System.out.println("keySet :");
        for(CameraDto camera : map.keySet()){
            System.out.println(camera);
        }

        //value
        System.out.println("Values() :");
        for (LensDto lens : map.values()){
            System.out.println(lens);
        }

        //entrySet
        System.out.println("\nEntrySet() :");
        for(Map.Entry<CameraDto, LensDto> entry : map.entrySet()){
            System.out.println("key :"+entry.getKey());
            System.out.println("value :"+entry.getValue());
            System.out.println("===================");
        }

        //replace
        System.out.println("replace ()");
        LensDto newLens = new LensDto(6,"FishEye",30000);
        map.replace(c2,newLens);
        System.out.println(map);

        //PutIfAbsent
        System.out.println("\nPutIfAbsent()");
        CameraDto c6 = new CameraDto(106,"panasonic",59000);
        LensDto l6 = new LensDto(6,"Zoom",25000);
        map.putIfAbsent(c6,l6);
        System.out.println(map);

        //getOrDefault
        System.out.println("getOrdefault()");
        CameraDto dummy = new CameraDto(200,"dummy",0);

        System.out.println(map.getOrDefault(dummy,new LensDto(0,"No lense Found",0)));


        //remove
        System.out.println("remove :");
        map.remove(c1);
        System.out.println(map);

        //foreach
        System.out.println("forEcah() :");
        map.forEach(((camera, lens) -> System.out.println(camera +"------------->"+lens)));

        //clear
        System.out.println("clear() :");
        map.clear();

        //isEmpty() after clear
        System.out.println("isEmpty() after clear :");
        System.out.println(map.isEmpty());



    }

}
