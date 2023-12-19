package evm;

public class Vote {
    public String getVote(int currentYear,int birthYear) throws Exception{
        if(currentYear-birthYear>=18){
            System.out.println("Allowed for Vote");
        }else{
            throw new Exception("Not Eligible To Vote");
        }
        return "Please Apply for Voter ID";
    }
}
