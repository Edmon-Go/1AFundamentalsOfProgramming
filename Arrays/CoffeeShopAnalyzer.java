public class CoffeeShopAnalyzer {
    public static void main(String[] args) {

        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        // Gumagawa tayo ng integer array na naglalaman ng bilang ng cups na nabenta mula Monday hanggang Sunday.

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // Gumagawa tayo ng String array na naglalaman ng pangalan ng bawat araw.

        System.out.println("--- Daily Sales ---");
        // Nagpi-print ng heading para sa daily sales.

        for (int i = 0; i < weeklySales.length; i++) {
            // Gumagamit ng for loop para isa-isang kunin ang laman ng array.
            // Ang i ay nagsisimula sa 0 at nadadagdagan hanggang sa huling index ng array.

            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
            // Ipinapakita ang pangalan ng araw at ang bilang ng cups na nabenta.
        }

        int totalSales = 0;
        // Gumagawa ng variable na totalSales na may panimulang value na 0.

        for (int dailySale : weeklySales) {
            // Gumagamit ng enhanced for loop para kunin ang bawat value sa weeklySales array.

            totalSales += dailySale;
            // Idinadagdag ang bawat daily sale sa totalSales.
        }

        double averageSales = (double) totalSales / weeklySales.length;
        // Kinukuha ang average sales sa pamamagitan ng paghahati ng total sales sa bilang ng araw.
        // Ginagamit ang double para makakuha ng decimal na sagot.

        System.out.println("\n--- Weekly Summary ---");
        // Nagpi-print ng heading para sa kabuuang summary ng isang linggo.

        System.out.println("Total Sales: " + totalSales + " cups");
        // Ipinapakita ang kabuuang bilang ng cups na naibenta sa buong linggo.

        System.out.println("Average Daily Sales: " + averageSales + " cups");
        // Ipinapakita ang average na bilang ng cups na nabenta bawat araw.

        // 4. Find maximum and minimum sales
        int maxSales = weeklySales[0];
        // Itinatakda ang unang value ng array bilang panimulang pinakamataas na sales.

        int minSales = weeklySales[0];
        // Itinatakda rin ang unang value bilang panimulang pinakamababang sales.

        String bestDay = daysOfWeek[0];
        // Itinatakda ang Monday bilang panimulang best day.

        String worstDay = daysOfWeek[0];
        // Itinatakda ang Monday bilang panimulang worst day.

        for (int i = 1; i < weeklySales.length; i++) {
            // Nagsisimula ang loop sa index 1 dahil nagamit na ang index 0 bilang panimulang value.

            if (weeklySales[i] > maxSales) {
                // Sinusuri kung mas mataas ang kasalukuyang sales kaysa sa maxSales.

                maxSales = weeklySales[i];
                // Kapag mas mataas, ina-update ang maxSales gamit ang bagong value.

                bestDay = daysOfWeek[i];
                // Ina-update ang bestDay ayon sa araw kung kailan pinakamataas ang sales.
            }

            if (weeklySales[i] < minSales) {
                // Sinusuri kung mas mababa ang kasalukuyang sales kaysa sa minSales.

                minSales = weeklySales[i];
                // Kapag mas mababa, ina-update ang minSales.

                worstDay = daysOfWeek[i];
                // Ina-update ang worstDay ayon sa araw kung kailan pinakamababa ang sales.
            }
        }

        System.out.println("\n--- Bests and Worsts ---");
        // Nagpi-print ng heading para sa pinakamataas at pinakamababang sales.

        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        // Ipinapakita kung anong araw ang may pinakamataas na sales at ilan ang nabenta.

        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
        // Ipinapakita kung anong araw ang may pinakamababang sales at ilan ang nabenta.
    }
}