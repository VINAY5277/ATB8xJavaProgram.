package oct.ex_09102024_singleinheritance.ex1;

public class Son extends Father {
    // son -> father

    void bhk3(){
        System.out.println("3bhk");
        //attribute father
        System.out.println(gold_f);
        //behavoir fahter
        bhk2();
    }
}
