class Q7 {
    public static void main(String[] args) {

        double pi = 3.14159;
        double radiusKm = 6378;

        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm);
        System.out.println("The volume of earth in cubic miles is " + volumeMiles);
    }
}
