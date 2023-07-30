public class WorldState {


    public boolean worldIsStability = false;
    public boolean worldIsJustice = false;
    public boolean wordIsClear = false;
    public boolean worldIsProgress = true;
    public boolean worldIsCrisis = true;
    public boolean worldIsBeautiful = true;
    public boolean wordIsWar = true;
    public boolean isWorldPositively = true;
    public boolean isWorldNegatively = false;

    public  void isWorldPositivelyGood(){

        isWorldPositively = worldIsStability &&  worldIsJustice ||  !wordIsClear || worldIsProgress && !worldIsCrisis || worldIsBeautiful && !wordIsWar ;



    }

    public  void  isWorldNegativelyGood(){

        isWorldNegatively = worldIsStability && !worldIsJustice && wordIsClear && worldIsBeautiful || !worldIsProgress && wordIsWar;
    }


}
