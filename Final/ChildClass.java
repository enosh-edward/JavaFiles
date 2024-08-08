public class ChildClass extends BaseClass{
    @Override
    protected void optionalMethod(){
        System.out.println("[Child:optionalMethod] EXTRA stuff Here");
        super.optionalMethod();
    }

    // @Override
    // public void recommendedMethod(){
    //     System.out.println("[Child:recommendedMethod]: i'll do things my way");
    //     optionalMethod();
    // }
    private void mandatoryMethod(){  // Here we are not overriding from baseclass but creating same private method with same name and it is acceptable
        System.out.println("[child:MandatoryMethod]: My own important stuff");
    }

    public static void recommendedStatic(){
        System.out.println("[Child.recommendedStatic] BEST Way to do it");
        optionalStatic();
    }
}
