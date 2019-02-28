/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCap10;

import Capitulo10.CabinRental;
import Capitulo10.Candle;
import Capitulo10.Car;
import Capitulo10.CarRental;
import Capitulo10.CollegeEmployee;
import Capitulo10.Die;
import Capitulo10.DinnerEvent;
import Capitulo10.DoublesTennisGame;
import Capitulo10.Faculty;
import Capitulo10.HolidayCabinRental;
import Capitulo10.Horse;
import Capitulo10.InsuredPackage;
import Capitulo10.Jupiterian;
import Capitulo10.LabCourse;
import Capitulo10.LeapYear;
import Capitulo10.LoadedDie;
import Capitulo10.LuxuryCarRental;
import Capitulo10.Martian;
import Capitulo10.MotorCycle;
import Capitulo10.Package;
import Capitulo10.Person;
import Capitulo10.RaceHorse;
import Capitulo10.ScentedCandle;
import Capitulo10.ShippingMethod;
import Capitulo10.Sizes;
import Capitulo10.Student;
import Capitulo10.TennisGame;
import Capitulo10.Year;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("****************************************************Problem 1");
        Horse h1 = new Horse();
        RaceHorse h2 = new RaceHorse();
        
        h2.setColor("White");
        h2.setName("Horsie");
        h2.setYear(1992);
        h2.setnRaces(18);
        
        h1.setColor("Black");
        h1.setName("Valentin");
        h1.setYear(1990);
        
        System.out.println("HORSE 1\nName: "+h1.getName()+"\nColor: "+h1.getColor()+"\nBirth date: "+h1.getYear()+"\n\n");
        System.out.println("HORSE 2\nName: "+h2.getName()+"\nColor: "+h2.getColor()+"\nBirth date: "+h2.getYear()+"\nRaces where compited: "+h2.getnRaces()+"\n\n");
        
        System.out.println("****************************************************Problem 2");
        
        Candle candle1 = new Candle("Yellow",2.0);
        ScentedCandle candle2=new ScentedCandle("Red",4.0,"Banana");
        
        System.out.println("CANDLE 1\nColor: "+candle1.getColor()+"\nHeight: "+candle1.getHeight()+" inches\nPrice: "+candle1.getPrice()+"\n\n");
        System.out.println("CANDLE 2\nColor: "+candle2.getColor()+"\nHeight: "+candle2.getHeight()+" inches\nPrice: "+candle2.getPrice()+"\nScent: "+candle2.getScent()+"\n\n");
        
        System.out.println("****************************************************Problem 3");
        
        TennisGame tGame1 = new TennisGame();
        DoublesTennisGame tGame2 = new DoublesTennisGame();
        
        tGame1.setNames("Eduardo", "Geronimo");
        tGame1.setScore1(4);
        tGame1.setScore2(4);
        
        tGame2.setNames("Jesus", "Maria","Jose","Benito");
        tGame2.setScore1(3);
        tGame2.setScore2(4);
        
        System.out.println(tGame1.toString());
        System.out.println(tGame2.toString());
        
        System.out.println("****************************************************Problem 4");
        
        Year year = new Year();
        LeapYear lyear = new LeapYear();
        
        System.out.println("Days remaining for new year: "+year.daysElapsed(1, 1));
        System.out.println("Days remainingfor new year: "+lyear.daysElapsed(3, 18));
        
        System.out.println("****************************************************Problem 5");
        
        CabinRental cRental = new CabinRental();
        HolidayCabinRental hCRental = new HolidayCabinRental();
        
        cRental.setcNumber(3);
        cRental.setnWeeks(3);
        
        hCRental.setcNumber(10);
        hCRental.setnRoom(4);
        hCRental.setnWeeks(4);
        
        System.out.println("For cabin 1\nCabin Number: "+cRental.getcNumber()+"\nNumber of weeks: "+cRental.getnWeeks()+"\nTotal: $"+cRental.getrRate());
        System.out.println("\n\nFor cabin 2\nCabin Number: "+hCRental.getcNumber()+"\nRoom number: "+hCRental.getnRoom()+"\nNumber of weeks: "+hCRental.getnWeeks()+"\nTotal: $"+hCRental.getrRate());
        
        System.out.println("****************************************************Problem 6");
        
        Package pac1 = new Package(3.2,ShippingMethod.A);
        Package pac2 = new Package(0.2,ShippingMethod.M);
        Package pac3 = new Package(1.2,ShippingMethod.T);
        
        InsuredPackage ipac1 = new InsuredPackage(0.2,ShippingMethod.A);
        InsuredPackage ipac2 = new InsuredPackage(4.1,ShippingMethod.M);
        InsuredPackage ipac3 = new InsuredPackage(3.0,ShippingMethod.T);
        
        pac1.display();
        System.out.println("\n\n");
        pac2.display();
        System.out.println("\n\n");
        pac3.display();
        System.out.println("\n\n");
        
        ipac1.display();
        System.out.println("\n\n");
        ipac2.display();
        System.out.println("\n\n");
        ipac3.display();
        System.out.println("\n\n");
        
        System.out.println("****************************************************Problem 7");
        
        CarRental caRental = new CarRental("Luis Fernando",70110,Sizes.ECONOMY,3);
        LuxuryCarRental clRental = new LuxuryCarRental("Erick",60000,Sizes.FULLSIZE,5,'y');
        LuxuryCarRental clRental2 = new LuxuryCarRental("Victor",60000,Sizes.FULLSIZE,5,'n');
        
        caRental.display();
        System.out.println("\n\n");
        clRental.display();
        System.out.println("\n\n");
        clRental2.display();
        System.out.println("\n\n");
        
        System.out.println("****************************************************Problem 8");
        LabCourse labC1 = new LabCourse("MATH",101,4);
        LabCourse labC2 = new LabCourse("BIO",301,4);
        
        labC1.display();
        System.out.println("\n\n");
        labC2.display();
        
        System.out.println("****************************************************Problem 9");
        
        Car car = new Car(8,12);
        MotorCycle motor = new MotorCycle(18,20);
        
        System.out.println(car.toString());
        System.out.println(motor.toString());
        
        System.out.println("****************************************************Problem 10");
        
        int c=0,f=0,s=0,zCode,phone,sNumber;
        String fName,lName,sAdress,dName,study;
        Double salary,average;
        Boolean tenured;
        
        char conf;     
        ArrayList<Person> arreglo = new ArrayList<>();
        
        Scanner Sc = new Scanner(System.in);
        
        do{
            System.out.println("Input type of person you want to in:\nC -> College Employee\nF -> Faculty\nS -> Student\nQ -> quit");
            conf=Sc.next().charAt(0);
            
            if(conf == 'C' || conf == 'c'){
                c++;
                if(c<=4){
                    System.out.println("Input first name:");
                    fName=Sc.nextLine();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input last name:");
                    lName=Sc.nextLine();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input street Adress:");
                    sAdress=Sc.nextLine();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input zip code:");
                    zCode=Sc.nextInt();
                    
                    System.out.println("Input phone number:");
                    phone=Sc.nextInt();
                    
                    System.out.println("Input social security number:");
                    sNumber=Sc.nextInt();
                    
                    System.out.println("Input salary:");
                    salary=Sc.nextDouble();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input department name:");
                    dName=Sc.nextLine();
                    
                    arreglo.add(new CollegeEmployee(sNumber,salary,dName,fName,lName,sAdress,zCode,phone));
                }else{
                    System.out.println("Error");
                    conf='q';
                }
            }else if(conf == 'F' || conf == 'f'){
                f++;
                if(f<=3){
                    System.out.println("Input first name:");
                    fName=Sc.nextLine();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input last name:");
                    lName=Sc.nextLine();
                    
                    //Sc.nextLine();
                    
                    System.out.println("Input street Adress:");
                    sAdress=Sc.nextLine();
                    
                    //Sc.nextLine();
                    
                    System.out.println("Input zip code:");
                    zCode=Sc.nextInt();
                    
                    System.out.println("Input phone number:");
                    phone=Sc.nextInt();
                    
                    System.out.println("Input social security number:");
                    sNumber=Sc.nextInt();
                    
                    System.out.println("Input salary:");
                    salary=Sc.nextDouble();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input department name:");
                    dName=Sc.nextLine();
                    
                    //Sc.nextLine();
                    
                    System.out.println("Tenured? true/false:");
                    tenured=Sc.nextBoolean();
                    
                    arreglo.add(new Faculty(tenured,sNumber,salary,dName,fName,lName,sAdress,zCode,phone));
                }else{
                    System.out.println("Error");
                    conf='q';
                }
            }else if (conf == 'S' || conf == 's'){
                s++;
                if(s<=7){
                    System.out.println("Input first name:");
                    fName=Sc.nextLine();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input last name:");
                    lName=Sc.nextLine();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input street Adress:");
                    sAdress=Sc.nextLine();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input zip code:");
                    zCode=Sc.nextInt();
                    
                    System.out.println("Input phone number:");
                    phone=Sc.nextInt();
                    
                    Sc.nextLine();
                    
                    System.out.println("Input study:");
                    study=Sc.nextLine();
                    
                    System.out.println("Input average:");
                    average=Sc.nextDouble();
                    
                    arreglo.add(new Student(study,average,fName,lName,sAdress,zCode,phone));
                    
                }else{
                    System.out.println("Error");
                    conf='q';
                }
            }
            
        }while(conf!='q' && conf != 'Q');
        
        for(Person aux:arreglo){
            aux.display();
            System.out.println("");
        }
        
        System.out.println("****************************************************Game Zone");
        
        Martian martian = new Martian(4,5,"Green");
        Jupiterian jupiterian = new Jupiterian(8,2,"Blue");
        
        System.out.println("Martian:\n"+martian.toString()+"\n");
        System.out.println("Jupiterian:\n"+jupiterian.toString()+"\n");
        
        int dice1=0,dice2=0;
        
        Die die2=new Die();
        Die die3=new Die();
        Die die1=new Die();
        LoadedDie die4=new LoadedDie();
        
        for(int i=0;i<1000;i++){
            die1.roll();
            die2.roll();
            
            if(die1.getNumber()>die2.getNumber()){
                dice1++;
            }
            
            die3.roll();
            die4.roll();
            
            if(die3.getNumber()>die4.getNumber()){
                dice2++;
            }
                
        }
        
        System.out.println("With two regular dice, the first one won "+dice1+" times out of 1000.");
        System.out.println("With one die and one loeaded die, the first one won "+dice2+" times out of 1000.");
        
        System.out.println("****************************************************Case Problem 1");
        
        DinnerEvent dinnerEvent = new DinnerEvent(5,1,3,0,2);
        
        System.out.println(dinnerEvent.toString());
        
        System.out.println("****************************************************Case Problem 2");
        
        int minutes;
        
        System.out.println("Input minutes:");
        minutes=Sc.nextInt();
        
        Capítulo3.SammysRentalPrice total = new Capítulo3.SammysRentalPrice(minutes);
        
        System.out.println(total.motto());
        System.out.println(total.toString());
        
    }
}
