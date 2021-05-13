package carro;

public class CarroGasolina extends Carrro {
    //Inmutabilidad
    private final IMotor motor;
    private  final ISuspension suspension;
    private  final IRelacionesDiferenciales relacionesDiferenciales;
    //Injección de Dependencias
    public CarroGasolina(IMotor motor, ISuspension suspension, IRelacionesDiferenciales relacionesDiferenciales) {
        this.motor = motor;
        this.suspension = suspension;
        this.relacionesDiferenciales = relacionesDiferenciales;
    }


    @Override
    void tipoCarroOffRoad() {
        motor.tipo();
        suspension.tipo();
        relacionesDiferenciales.tipo();
        System.out.println("Carro de Gasolina");
    }
}
