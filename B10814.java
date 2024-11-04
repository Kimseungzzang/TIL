
import java.util.*;
public class B10814 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        List<person> personList=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int age = sc.nextInt();
            String name = sc.nextLine();
          
            personList.add(new person(age, name, i));
        }
        Collections.sort(personList,(a,b)->{
            if(a.getAge()!=b.getAge())
            {
                return a.getAge()-b.getAge();
            }
            else{
                return a.getNum()-b.getNum();
            }
        });
        
      
        for(int i=0;i<n;i++)
        {
            System.out.print(personList.get(i).getAge()+""+personList.get(i).getName());
            if (i < personList.size() - 1) {
                System.out.println(); // 마지막 줄에는 줄바꿈이 추가되지 않도록
            }
 
        
        }
    }
}
class person{
    private int age;
    private String name;
    private int num;


    int getAge()
    {
        return this.age;
    }

    int getNum()
    {
        return this.num;
    }

    String getName()
    {
        return this.name;
    }
    person(int age,String name,int num)
    {
        this.age=age;
        this.name=name;
        this.num=num;
    }

}
