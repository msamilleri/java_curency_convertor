import java.util.Scanner;

public class Main {

    public static double dollar2tl(double dollar){
        double turkish_lira=18.75;
        return (dollar*turkish_lira);
    }
    public static double euro2tl(double euro){
        double turkish_lira=20.25;
        return (euro*turkish_lira);
    }
    public static double sterlintl(double sterlin){
        double turkish_lira=22.69;
        return (sterlin*turkish_lira);
    }

    public static double kwd2tl(double kuvyet_dinari){
        double turkish_lira=61.71;
        return (kuvyet_dinari*turkish_lira);
    }


    public static double tl2dollar(double tl){
        double turkish_lira=18.75;
        return (tl/turkish_lira);
    }
    public static double tl2euro(double tl){
        double turkish_lira=20.25;
        return (tl/turkish_lira);
    }
    public static double tl2sterlin(double tl){
        double turkish_lira=22.69;
        return (tl/turkish_lira);
    }
    public static double tl2kwd(double tl){
        double turkish_lira=61.71;
        return (tl/turkish_lira);
    }


    public static void show_main_menu(){

        System.out.println("\tCurrency Convertor\nSelect your money?\n1.Turkish Lira\n2.Euro\n3.Dollar\n4.Sterlin\n5.Kuwait Dinar");
    }
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);


        while (true){
            show_main_menu();
            int selected=input.nextInt();
            if(selected==1){
                System.out.println("which money do you want to change?\n1.Euro\n2.Dollar\n3.Sterlin\n4.Kuwait Dinar");
                int sel_tl=input.nextInt();
                switch (sel_tl){
                    case 1:
                        System.out.println("how much money ?");
                        double tl_money_one=input.nextDouble();
                        System.out.println("Tl to Euro ="+tl2euro(tl_money_one));
                        break;
                    case 2:
                        System.out.println("how much money ?");
                        double tl_money_two=input.nextDouble();
                        System.out.println("Tl to Dollar ="+tl2dollar(tl_money_two));
                        break;
                    case 3:
                        System.out.println("how much money ?");
                        double tl_money_the=input.nextDouble();
                        System.out.println("Tl to Strelin ="+tl2sterlin(tl_money_the));
                        break;
                    case 4:
                        System.out.println("how much money ?");
                        double tl_money_four=input.nextDouble();
                        System.out.println("Tl to Kuwaid ="+tl2kwd(tl_money_four));
                        break;
                    default:
                        System.out.println("ERROR");
                }
            }


            if(selected==2){
                System.out.println("which money do you want to change?\n1.Turkish Lira\n2.Dollar\n3.Sterlin\n4.Kuwait Dinar");
                int sel_tl=input.nextInt();
                switch (sel_tl){
                    case 1:
                        System.out.println("how much money ?");
                        double tl_money_one=input.nextDouble();
                        System.out.println("Tl to Euro ="+tl2euro(tl_money_one));
                        break;
                    case 2:
                        System.out.println("how much money ?");
                        double tl_money_two=input.nextDouble();
                        System.out.println("Tl to Dollar ="+tl2dollar(tl_money_two));
                        break;
                    case 3:
                        System.out.println("how much money ?");
                        double tl_money_the=input.nextDouble();
                        System.out.println("Tl to Strelin ="+tl2sterlin(tl_money_the));
                        break;
                    case 4:
                        System.out.println("how much money ?");
                        double tl_money_four=input.nextDouble();
                        System.out.println("Tl to Kuwaid ="+tl2kwd(tl_money_four));
                        break;
                    default:
                        System.out.println("ERROR");
                }
            }





        }
    }
}