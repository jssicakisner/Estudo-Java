package interfaces_;

interface Figura {
    String getNome();
    String getCor();
}

interface DimensaoSuperficial {
    double calcularArea();
}

interface DimensaoVolumetrica {
    double calcularVolume();
}

interface Figura2D extends Figura {
    double calcularArea();
}

interface Figura3D extends Figura {
    double calcularVolume();
}

abstract class FiguraGeometrica implements Figura {
    protected String nome;
    protected String cor;

    public FiguraGeometrica(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public String getCor() {
        return cor;
    }
}

class Circulo extends FiguraGeometrica implements Figura2D, DimensaoSuperficial {
    private double raio;

    public Circulo (String cor, double raio) {
        super("Circulo", cor);
        this.raio = raio;
    }
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}

class Quadrado extends FiguraGeometrica implements Figura2D, DimensaoSuperficial {
    private double lado;

    public Quadrado (String cor, double lado) {
        super("Quadrado", cor);
        this.lado = lado;
    }
    public double calcularArea() {
        return lado * lado;
    }
}

class Triangulo extends FiguraGeometrica implements Figura2D, DimensaoSuperficial {
    private double base;
    private double altura;

    public Triangulo (String cor, double base, double altura) {
        super("Triangulo", cor);
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Cubo extends FiguraGeometrica implements Figura3D, DimensaoVolumetrica {
    private double aresta;

    public Cubo (String cor, double aresta) {
        super("Cubo", cor);
        this.aresta = aresta;
    }
    public double calcularVolume() {
        return (aresta * aresta * aresta);
    }
}

class Cilindro extends FiguraGeometrica implements Figura3D, DimensaoVolumetrica {
    private double raio;
    private double altura;

    public Cilindro (String cor, double raio, double altura) {
        super("Cilindro", cor);
        this.raio = raio;
        this.altura = altura;
    }
    public double calcularVolume() {
        return (Math.PI * (raio * raio) * altura);
    }
    public double calcularArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }
}

class Piramide extends FiguraGeometrica implements Figura3D, DimensaoVolumetrica {
    private double base;
    private double altura;

    public Piramide (String cor, double base, double altura) {
        super("Piramide", cor);
        this.base = base;
        this.altura = altura;
    }
    public double calcularVolume() {
        return (base * altura * altura) / 3;
    }
    public double calcularArea() {
        double areaBase = base * base;
        double areaLateral = base * Math.sqrt((base / 2) * (base / 2) + altura * altura) + base * Math.sqrt((base / 2) * (base / 2) + altura * altura);
        return areaBase + areaLateral;
    }
}