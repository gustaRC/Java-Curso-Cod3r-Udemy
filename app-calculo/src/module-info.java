import br.com.beltsistemas.calculo.CalculadoraImpl;

module app.calculo {
    requires transitive app.logging;
    exports br.com.beltsistemas.calculo;

    requires app.api;
    provides
            br.com.beltsistemas.app.Calculadora
        with
            br.com.beltsistemas.calculo.CalculadoraImpl;
    //  declarando que a CalculadoraImpl implementa a interface Calculadora
}