public class BMI {

    private double weight;
    private double height;
    private double bmi;
    private String bmiInterpretation;
    public final static double INCHTOMETER = 0.0254;
    public final static double POUNDSTOKILO = 0.45359237;
    public BMI(double weight, double height) {
        this.weight = weight * POUNDSTOKILO;
        this.height = height * INCHTOMETER;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBmi() {
        this.bmi = this.weight / (this.height * this.height);
        return bmi;
    }

    public String getBmiInterpretation() {
        bmi = this.bmi;
        if (bmi < 18.5){
            this.bmiInterpretation = "Underweight";
        }

        else if(bmi < 25.0){
            this.bmiInterpretation = "Normal";
        }
        else if(bmi < 30.0){
            this.bmiInterpretation = "Overweight";
        }
        else{
            this.bmiInterpretation = "Obese";
        }
        return bmiInterpretation;
    }

}
