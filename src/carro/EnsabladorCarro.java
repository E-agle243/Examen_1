package carro;

public class EnsabladorCarro {


    public static void main(String[] args) {

        new CarroDiesel(createFactoryMotor5000(MotorType.MOTOR5000),
                        createFactoryRelacional(RelacionDiferencialType.RELACION_DIFERENCIAL_4_7),
                        createFactoryARM(SuspencionType.SUSPENCIONARB)).tipoCarroOffRoad();

        new CarroGasolina(createFactoryMotor6000(MotorType.MOTOR6000),
                         createFactoryTJM(SuspencionType.SUSPENCIONTJM),
                         createFactoryRelacional4_9(RelacionDiferencialType.RELACION_DIFERENCIAL_4_9)).tipoCarroOffRoad();


    }
    private enum MotorType{
        MOTOR5000,
        MOTOR6000
    }
    private enum SuspencionType {
        SUSPENCIONARB,
        SUSPENCIONTJM
    }
    private enum RelacionDiferencialType {
        RELACION_DIFERENCIAL_4_7,
        RELACION_DIFERENCIAL_4_9
    }

     private static Motor5000 createFactoryMotor5000 (MotorType type){
        return new Motor5000();
     }

    private static Motor6000 createFactoryMotor6000 (MotorType type){
        return new Motor6000();
    }


    private  static SuspencionARB createFactoryARM(SuspencionType type){
        return new SuspencionARB();
     }

    private  static SuspencionTJM createFactoryTJM(SuspencionType type){
        return new SuspencionTJM();
    }

    private static  RelacionDiferencial4_7 createFactoryRelacional(RelacionDiferencialType type){
        return new RelacionDiferencial4_7();
     }

    private static  RelacionDiferencial4_9 createFactoryRelacional4_9 (RelacionDiferencialType type){
        return new RelacionDiferencial4_9();
    }



}
