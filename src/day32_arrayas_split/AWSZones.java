package day32_arrayas_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-----Starting deployment of etsy app to AWS zone------");
        String[] zonesToDeploy = zones.split(",");
        for(String eachZone:zonesToDeploy){
            System.out.println(eachZone);
            System.out.println("Deploying["+app+"]to " +eachZone+ ".....");
            System.out.println("Deployment complete for " + eachZone);
        }
        System.out.println("-----All the deployments complete------");
    }
}
