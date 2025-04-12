public class Kitchen {
    private Cook cook;
    public Kitchen (Cook cook){
        this.cook = cook;
    }
    public void StartCooking(){
        System.out.println("Kitchen ready");
        cook.prepareMeal();
    }
}
