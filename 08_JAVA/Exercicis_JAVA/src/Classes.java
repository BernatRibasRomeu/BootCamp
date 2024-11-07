public class Classes {
    public static void main(String[] args) {

    }

    public class Cotxe {
        private int rodes = 4;
        private String marca = "";
        private String model = "";
        private  int fuel = 100;

        public int reFuel(int repostar){
            if (fuel + repostar == 100){
                System.out.println("Dipòsit ple");
                return 100;
            } else if (fuel + repostar > 100) {
                int sobra = (fuel + repostar) - 100;
                System.out.println("Han sobrat " + sobra + " litres");
                return sobra;
            } else {
                int diposit = fuel + repostar;
                System.out.println("Tens " + diposit + " litres al dipòsit");
                return  diposit;
            }
        }

        public Cotxe() {

        }

        public Cotxe(int fuel, String model, String marca, int rodes) {
            this.fuel = fuel;
            this.model = model;
            this.marca = marca;
            this.rodes = rodes;
        }

        public int getRodes() {
            return rodes;
        }

        public String getMarca() {
            return marca;
        }

        public String getModel() {
            return model;
        }

        public int getFuel() {
            return fuel;
        }

        public void setRodes(int rodes) {
            this.rodes = rodes;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }
}
