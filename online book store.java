import java.util.*;
class Books
{
    int id,qnty;
    String book_name,author_name;
    Books(String book_name,String author_name,int id,int qnty)
    {
        this.id=id;
        this.book_name=book_name;
        this.author_name=author_name;
        this.qnty=qnty;
    }
}
class Student
{
    String name;
    int id,YoP;
    Student(String name,int id,int YoP)
    {
        this.name=name;
        this.id=id;
        this.YoP=YoP;
    }
}
class Search
{
    
}
class Reciept
{
    Reciept(String name,int id1,int yop,String book_name2,int id_no)
    {
        System.out.println("Student Name        :"+name);
        System.out.println("Student Id          :"+id1);
        System.out.println("Year of Graduating  :"+yop);
        System.out.println("Book Name           :"+book_name2);
        System.out.println("Book Id             :"+id_no);
    }
}
class Main10
{
    public static void main(String[] args) 
    {
        //Map<Integer,Books> map=new HashMap<Integer,Books>();
        int arr[]=new int[100];
        Books b1=new Books("The India Story\t\t\t\t\t\t","Bimal Jalal\t\t\t",1122334401,5);
        Books b2=new Books("Listen to Your Heart: The London Adventure\t\t","Ruskin Bond\t\t\t",1122334402,4);
        Books b3=new Books("Business of Sports:The Winning Formula for Success\t","Vinit Karnik\t\t\t",1122334403,4);
        Books b4=new Books("A Place Called Home\t\t\t\t\t","Preeti Shenoy\t\t\t",1122334404,3);
        Books b5=new Books("Modi@20:Dreams Meeting Delivery\t\t\t\t","VP  Naidu\t\t\t",1122334405,5);
        Books b6=new Books("The Struggle for Police Reforms in India                ","Prakash Singh                   ",1122334406,1);
        Books b7=new Books("INDO-PAK WAR 1971- Reminiscences of Air Warriors        ","Rajnath Singh                   ",1122334407,10);
        Books b8=new Books("Leaders, Politicians, Citizens                          ","Rasheed Kidwai                  ",1122334408,7);
        Books b9=new Books("Birsa Munda \u2013 Janjatiya Nayak                      ","     Prof. Alok                      ",1122334409,4);
        Books b10=new Books("Lal SalamS                                             "," mriti Irani                     ",1122334410,5);
        arr[1]=b1;//map.put(1,b1);
        arr[2]=b2;//map.put(2,b2);
        arr[3]=b3;//map.put(3,b3);
        arr[4]=b4;//map.put(4,b4);
        arr[5]=b5;//map.put(5,b5);
        arr[6]=b6;//map.put(6,b6);
        arr[7]=b7;//map.put(7,b7);
        arr[8]=b8;//map.put(8,b8);
        arr[9]=b9;//map.put(9,b9);
        arr[10]=b10;//map.put(10,b10);
        System.out.println(arr);
        System.out.println("___________________________________________________________________________________________________________________");
        System.out.println("BOOK_NAME\t\t\t\t\t\tAUTHOR_NAME\t\t\tBOOK_ID\t\tBOOK_QUANTITY");
        System.out.println("___________________________________________________________________________________________________________________");
        for(Map.Entry<Integer,Books> x:map.entrySet())
        {
            //int key=x.getKey();
            Books b=x.getValue();
            System.out.println(b.book_name+b.author_name+b.id+"\t"+b.qnty);
            System.out.println();
        }
    

        
       Student s1=new Student("Janu",1430,2025);
       Student s2=new Student("Balaji",1432,2025);
       Student s3=new Student("Balu",1431,2025);
       Student s4=new Student("Anitha",1433,2025);
       Student s5=new Student("Adarsh",1434,2024);
       Student s6=new Student("Rupa",1435,2024);
       Student s7=new Student("Vasu",1436,2026);
       Student s8=new Student("Sai",1437,2026);
       Student s9=new Student("Rahul",1438,2025);
       Student s10=new Student("Mukesh",1439,2025);
       
       Map<Integer,Student> student_map=new HashMap<Integer,Student>();
       student_map.put(1,s1);
       student_map.put(2,s2);
       student_map.put(3,s3);
       student_map.put(4,s4);
       student_map.put(5,s5);
       student_map.put(6,s6);
       student_map.put(7,s7);
       student_map.put(8,s8);
       student_map.put(9,s9);
       student_map.put(10,s10);
       Scanner in=new Scanner(System.in);
       System.out.println("Enter u r id");
       int input=in.nextInt();
        for(Map.Entry<Integer,Student> y:student_map.entrySet())
        {
            //int j=y.getKey();
            Student s=y.getValue();        
            if(s.id==input)
            {
                System.out.println("Enter Book_id u want:");
                int input1=in.nextInt();
                for(Map.Entry<Integer,Books> z:map.entrySet())
                {
                    //int key=z.getKey();
                    Books bb=z.getValue();
                    if(input1==bb.id)
                    {
                        if(bb.qnty>0)
                        {
                            String name1=s.name;
                            int num=s.id;
                            int G=s.YoP;
                            String book_name1=bb.book_name;
                            int number=bb.id;
                            Reciept r=new Reciept(name1,num,G,book_name1,number);
                        }
                    }
                }
            }
        }
        
    }
}


