public class Titik {

        private int x;
        private int y;
        public Titik(){
            x = 0;
            y = 0;
        }
        public void inisialisasiTitik(int x, int y){
            this.x = x;
            this.y = y;
        }
        public void tampilTitik(){
            System.out.println("("+x+", "+y+")");
        }
        public void perkalianSkalar(double skalar){
            skalar = ((x*skalar) + (y * skalar));
            System.out.println("Nilai Skalar : " + skalar);
        }
        public void pencerminanSumbuX(){
            y = -y;
            System.out.println("("+x+", "+y+")");
        }
        public void pencerminanSumbuY(){
            x = -x;
            System.out.println("("+x+", "+y+")");
        }
    public int jarak(int x2, int y2){
        int jarak;
        jarak = (int) Math.sqrt((x2 - x) * (x2 - x ))+ ((y2 + y) *(y2-y));
        return jarak;
    }
}


