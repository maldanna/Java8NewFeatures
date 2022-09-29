import java.util.ArrayList;
import java.util.List;
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


    }

    public static void main(String[] args) {
        StreamsAPI obj1=new StreamsAPI();
        obj1.streamfileter();
        
    }

}