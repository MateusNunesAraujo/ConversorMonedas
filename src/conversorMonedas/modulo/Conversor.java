package conversorMonedas.modulo;

public class Conversor {
    private float valor;
    private String base_code;
    private String target_code;
    private float conversion_rate;
    private float conversion_result;

    public Conversor(String base_code, String target_code, float conversion_rate, float conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public float getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(float conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public float getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(float conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return String.format("El valor de %f [%s] corresponde al valor final de ==> %f [%s]",this.valor,this.base_code,this.conversion_result,this.target_code);
    }
}
