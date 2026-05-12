module app.financeiro {

//  requires app.calculo; //não precisamos mais desse módulo, depende do app.calculo em si
    requires app.api; //agora dependemos diretamente do módulo api (módulo somente com Interfaces) por causa do Provides With
    //não dependemos mais da implementação da Interface, mas sim do proprio módulo que declara a Interface
    uses br.com.beltsistemas.app.Calculadora; //declarando que estamos usando nesse módulo a Interface Calculadora
}