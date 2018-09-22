
import java.io.*;
public class bigbazar
{
    public static void main(String args[])throws IOExceptionmd
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int pp=0,i1,ch,ch1=0,num=0;
        int rate[]=new int[100];
        int amount[]=new int[100];
        int quantity[]=new int[100];
        String item[]=new String[100];
        String name1,date,add;
        System.out.println("welcome to bigbaazar");
        System.out.println("Enter the name of Customer");
        name1=in.readLine();
        System.out.println("Enter the date in this formate '14/12/1996'");
        date=in.readLine();
        System.out.println("Enter the Address ");
        add=in.readLine();
        while(true)
        {
        
        System.out.println("1 for mobile");
        System.out.println("2 for tablet pc");
        System.out.println("3 for desktop");
        System.out.println("4 for monitor ");
        System.out.println("5 for usb modem");
        System.out.println("6 for quit");
        ch=Integer.parseInt(in.readLine());
        
                 if(ch==1)
                 {
                    while(true)
                    {
                    System.out.println("1-samsung s2 ,Rs:-22000");
                    System.out.println("2-Nokia lumia 920,Rs:-25000");
                    System.out.println("3-Sony Xperia Z,Rs:-45000");
                    System.out.println("4-Spice Coolpad MI-515,Rs-9500");
                    System.out.println("5-lenevo Thinkpad,Rs-38000");
                    System.out.println("6 for quit");
                    ch1=Integer.parseInt(in.readLine());
                    if(ch1==1)
                    {
                        item[pp]="samsung s2                    ";
                        rate[pp]=22000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==2)
                    {
                        item[pp]="Nokia lumia 920               ";
                        rate[pp]=25000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==3)
                    {
                        item[pp]="Sony Xperia Z                 ";
                        rate[pp]=45000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==4)
                    {
                        item[pp]="Spice Coolpad MI-515          ";
                        rate[pp]=9500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==5)
                    {
                        item[pp]="lenevo Thinkpad               ";
                        rate[pp]=38000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==6)
                    {
                        break;
                    }
                }
            }
            
                if(ch==2)
                {
                    
                    while(true)
                    {
                    System.out.println("1-samsung s Tablet ,Rs:-32500");
                    System.out.println("2-Bsnl Pneta ,Rs:-2500");
                    System.out.println("3-Sony Xperia Z tablet,Rs:-40000");
                    System.out.println("4-Akash 7+ Tablet,Rs-6500");
                    System.out.println("5-lenevo Thinkpad tablet,Rs-8000");
                    System.out.println("6 for quit");
                    ch1=Integer.parseInt(in.readLine());
                    if(ch1==1)
                    {
                        item[pp]="samsung s Tablet              ";
                        rate[pp]=35000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==2)
                    {
                        item[pp]="Bsnl Pneta                    ";
                        rate[pp]=2500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==3)
                    {
                        item[pp]="Sony Xperia Z Tablet          ";
                        rate[pp]=40000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==4)
                    {
                        item[pp]="Akash 7+ Tablet               ";
                        rate[pp]=6500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==5)
                    {
                        item[pp]="lenevo Thinkpad Tablet        ";
                        rate[pp]=8000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==6)
                    {
                        break;
                    }
                }
            }
            if(ch==3)
                 {
                    while(true)
                    {
                    System.out.println("1-Dell Inspiron x23 ,Rs:-32500");
                    System.out.println("2-HP envy windows@8 ,Rs:-45000");
                    System.out.println("3-Toshiba thunder bolt,Rs:-65000");
                    System.out.println("4-Apple mac book ,Rs-11500");
                    System.out.println("5-Asus gaming zone 65,Rs-78000");
                    System.out.println("6 for quit");
                    ch1=Integer.parseInt(in.readLine());
                    if(ch1==1)
                    {
                        item[pp]="Dell Inspiron x23             ";
                        rate[pp]=32500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==2)
                    {
                        item[pp]="HP envy windows@8             ";
                        rate[pp]=45000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==3)
                    {
                        item[pp]="Toshiba thunder bolt          ";
                        rate[pp]=65000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==4)
                    {
                        item[pp]="Apple mac book                ";
                        rate[pp]=11500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==5)
                    {
                        item[pp]="Asus gaming zone 65           ";
                        rate[pp]=78000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==6)
                    {
                        break;
                    }
                }
            }
            if(ch==4)
                 {
                    while(true)
                    {
                    System.out.println("1-Dell 14`inch ,Rs:-6500");
                    System.out.println("2-HP 21`inch ,Rs:-9500");
                    System.out.println("3-Toshiba 32`inch,Rs:-15000");
                    System.out.println("4-Apple 32`inch ,Rs-31500");
                    System.out.println("5-Asus 19`inch,Rs-8000");
                    System.out.println("6 for quit");
                    ch1=Integer.parseInt(in.readLine());
                    if(ch1==1)
                    {
                        item[pp]="Dell 14`inch                  ";
                        rate[pp]=6500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==2)
                    {
                        item[pp]="HP 21`inch                    ";
                        rate[pp]=9500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==3)
                    {
                        item[pp]="Toshiba 32`inch               ";
                        rate[pp]=15000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==4)
                    {
                        item[pp]="Apple 32`inch                 ";
                        rate[pp]=31500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==5)
                    {
                        item[pp]="Asus 19`inch                  ";
                        rate[pp]=8000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==6)
                    {
                        break;
                    }
                }
            }
            if(ch==5)
                 {
                    while(true)
                    {
                    System.out.println("1-D-link Router 605 ,Rs:-1500");
                    System.out.println("2-TP-Link  ,Rs:-900");
                    System.out.println("3-Micromax 3G Router,Rs:-5000");
                    System.out.println("4-Edimaxx 9Dbi Antena Router ,Rs-1800");
                    System.out.println("5-Tata photon 3G usb modem,Rs-1250");
                    System.out.println("6 for quit");
                    ch1=Integer.parseInt(in.readLine());
                    if(ch1==1)
                    {
                        item[pp]="D-link Router 605             ";
                        rate[pp]=1500;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==2)
                    {
                        item[pp]="TP-Link                       ";
                        rate[pp]=900;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==3)
                    {
                        item[pp]="Micromax 3G Router            ";
                        rate[pp]=5000;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==4)
                    {
                        item[pp]="Edimaxx 9Dbi Antena Router    ";
                        rate[pp]=1800;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==5)
                    {
                        item[pp]="Tata photon 3G usb modem      ";
                        rate[pp]=1250;
                        System.out.println("enter the Quantity");
                        quantity[pp]=Integer.parseInt(in.readLine());
                        amount[pp]=rate[pp]*quantity[pp];
                        num=num+amount[pp];
                        pp++;
                    }
                    if(ch1==6)
                    {
                        break;
                    }
                }
            }
            
                    
            
        
           if(ch==6)
           {
               System.out.println("thank you");
               break;
        }
    }

         
       
  System.out.print('\u000c');
System.out.println("****************************BIGBAZAAR******************************************");
System.out.println("                      Computer Generated Invoice                     ");
System.out.println("                      Name of Customer is "+name1                     );
System.out.println("                      Date of Buying is "+date                        );
System.out.println("                      Address of customer is "+add                    );
System.out.println("Sno"+'\t'+"item                          "+'\t'+"rate"+'\t'+"quantity"+'\t'+"amount");
for(i1=0;i1<pp;i1++)
{
System.out.println((i1+1)+"	"+item[i1]+'\t'+rate[i1]+'\t'+quantity[i1]+'\t'+'\t'+amount[i1]);
}
System.out.println("Total amount is "+num);
String a[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twentyone","twentytwo","twentythree","twentyfour","twentyfive","twentysix","twentyseven","twentyeight","twentynine","thirty","thirtyone","thirtytwo","thirtythree","thirtyfour","thirtyfive","thirtysix","thirtyseven","thirtyeight","thirtynine","fourty","fourtyone","fourtytwo","fourtythree","fourtyfour","fourtyfive","fourtysix","fourtyseven","fourtyeight","fourtynine","fifty","fiftyone","fiftytwo","fiftythree","fiftyfour","fiftyfive","fiftysix","fiftyseven","fiftyeight","fiftynine","sixty","sixtyone","sixtytwo","sixtythree","sixtyfour","sixtyfive","sixtysix","sixtyseven","sixtyeight","sixtynine","seventy","seventyone","seventytwo","seventythree","seventyfour","seventyfive","seventysix","seventyseven","seventyeight","seventynine","eighty","eightyone","eightytwo","eightythree","eightyfour","eightyfive","eightysix","eightyseven","eightyeight","eightynine","ninty","nintyone","nintytwo","nintythree","nintyfour","nintyfive","nintysix","nintyseven","nintyeight","nintynine"};
            int l,p1,p2,p3,i,p;
            String str="";
        String name=num+"";
        l=name.length();
        if(l==4||l==5)
        {
            p1=num/1000;
            for(i=0;i<100;i++)
            {
                if(i==p1&&p1!=0)
                {
                    str=str+a[i]+"  thousand";
                }
            }
            p2=(num%1000)/100;
            for(i=0;i<100;i++)
            {
                if(i==p2&&p2!=0)
                {
                    str=str+"  "+a[i]+"  hundred";
                }
            }
            p3=(num%1000)%100;
            for(i=0;i<100;i++)
            {
                if(i==p3&&p3!=0)
                {
                    str=str+"  and  "+a[i]+"  only";
                }
            }
        }
         if(l==6||l==7)
        {
            p=num/100000;
            for(i=0;i<100;i++)
            {
                if(i==p&&p!=0)
                {
                    str=str+a[i]+" lac";
                }
            }
            p1=num%100000;
            p1=p1/1000;
            for(i=0;i<100;i++)
            {
                if(i==p1&&p1!=0)
                {
                    str=str+" "+a[i]+"  thousand";
                }
            }
            p2=(num%1000)/100;
            for(i=0;i<100;i++)
            {
                if(i==p2&&p2!=0)
                {
                    str=str+"  "+a[i]+"  hundred";
                }
            }
            p3=(num%1000)%100;
            for(i=0;i<100;i++)
            {
                if(i==p3&&p3!=0)
                {
                    str=str+"  and  "+a[i];
                }
            }
        }
        System.out.println("Amount in word:-");
    System.out.println(str+"  only");
    System.out.println("****************************THANK YOU VISIT AGAIN********************************");
}
}

                

        
         
            