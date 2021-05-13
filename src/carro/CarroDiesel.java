package carro;

public class CarroDiesel extends Carrro{
    //Inmutabilidad
    private final IMotor motor;
    private final IRelacionesDiferenciales relacionesDiferenciales;
    private final ISuspension suspension;
//Injección de dependencias
    public CarroDiesel(IMotor motor, IRelacionesDiferenciales relacionesDiferenciales, ISuspension suspension) {
        this.motor = motor;
        this.relacionesDiferenciales = relacionesDiferenciales;
        this.suspension = suspension;
    }


    @Override
    void tipoCarroOffRoad() {
        motor.tipo();
        relacionesDiferenciales.tipo();
        suspension.tipo();
        System.out.println("Carro de Diesel");
    }
}
