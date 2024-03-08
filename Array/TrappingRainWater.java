
public class TrappingRainWater {
    public static void trap(int[]heights){
        int Leftmax[]= new int[heights.length];
        Leftmax[0]=heights[0];
        for (int i = 1; i < heights.length; i++) {
            Leftmax[i] = Math.max(heights[i],Leftmax[i-1]); 
        } 
        int Rightmax[]=new int [heights.length];
        Rightmax[Rightmax.length - 1] = heights[heights.length - 1]; 
        for(int i= heights.length-2;i>=0;i--){
            Rightmax[i] = Math.max(Rightmax[i+1],heights[i]); 
        }
        int  trappedWater=0;
        for(int i=0;i<heights.length;i++){
             int waterlevel=Math.min(Leftmax[i],Rightmax[i]) ;
             trappedWater+=waterlevel-heights[i];
        }
        System.out.println("The amount of rainwater trapped is "+trappedWater);
    }
    public static void main(String[] args) {
        int[] heights = new int[]{4,2,0,6,3,2,5};
        trap(heights);
    }
}