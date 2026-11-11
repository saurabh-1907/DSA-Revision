class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;

    public RideSharingSystem() {

        rider = new LinkedList<>();
        driver = new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        rider.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(driver.size() != 0 && rider.size() != 0){
            return new int[]{driver.poll(), rider.poll()};
        }
        return new int[] {-1, -1};
        
    }
    
    public void cancelRider(int riderId) {
        rider.remove(riderId);
    }
}
