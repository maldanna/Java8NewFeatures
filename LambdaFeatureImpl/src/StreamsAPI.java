import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class StreamsAPI{
    
    public void streamfileter(){

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(2);a.add(3);
        List<Integer> result=a.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("reuslt is : "+ result);
        List<Integer> mapResult=a.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println("reuslt is : "+ mapResult);

        Map<Integer,String> mapObj= new HashMap<Integer,String>();

        mapObj.put(1,"maldanna");
        mapObj.put(2,"ram");
        mapObj.put(3,"india");

        mapObj.forEach((key,value)->{System.out.println("key is: "+key+" value is : "+value);});

        System.out.println("******************");
        
        mapObj.entrySet().stream().forEach(obj->
                {System.out.println("key is: "+obj.getKey() + "  values is : "+obj.getValue());}
            );

    }


    public static void main(String[] args) {
        StreamsAPI obj1=new StreamsAPI();
        obj1.streamfileter();
        
    }

}