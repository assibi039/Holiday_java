class Holiday { 
    private 

 String name;

 int day; 

 String month;

// your code goes here 
 public 
 void setname(String name)
{
    this.name=name;
}
 void setday(int day)
{
    this.day=day;
}
 void setmonth(String month)
{
    this.month=month;
}
 String getname()
{
    return name;
}
 int getday()
{
    return day;
}
 String getmonth()
{
    return month;
}
 boolean inSameMonth(Holiday h1, Holiday h2) 
 {
            if(h1.getmonth().equals(h2.getmonth())) 
            {
                return true;
            } else 
            {
                return false;
            }
 }

}

 public class holiday
{
     public static void main(String[] args) {
        System.out.println("Hello World");
        Holiday h = new Holiday();
        h.setname("Inde");
        h.setday(15);
        h.setmonth("aug");
        System.out.println(h.getname()+h.getday()+h.getmonth());
        Holiday h1 = new Holiday();
        h1.setname("Inde");
        h1.setday(15);
        h1.setmonth("autt");
        System.out.println(h1.getname()+h1.getday()+h1.getmonth());
        Holiday h3 = new Holiday();
        if(h3.inSameMonth(h1,h)==true) {
            System.out.println("Months are the same");
        }
        else {
            System.out.println("Months are not the same");
        }
    }
}
