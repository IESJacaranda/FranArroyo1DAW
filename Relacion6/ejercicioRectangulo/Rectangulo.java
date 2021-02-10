

/* Decompiler 7ms, total 480ms, lines 36 */
package ejercicioRectangulo;

public class Rectangulo {
   private double altura=1.0;
   private double base=1.0;
   private double area;
   private double perimetro;

   public Rectangulo(int altura, int base) {
      this.altura = altura;
      this.base = base;
   }

   public double getAltura() {
      return this.altura > 0 && this.altura < 20 ? this.altura : -1;
   }

   public void setAltura(int altura) {
      this.altura = altura;
   }

   public double getBase() {
      return this.base > 0 && this.base < 20 ? this.base : -1;
   }

   public void setBase(int base) {
      this.base = base;
   }

   public String toString() {
      this.area = (double)(this.base * this.altura);
      this.perimetro = (double)(this.base * 2 + this.altura * 2);
      return "El area es " + this.area + " y el perimetro es:" + this.perimetro;
   }
}

