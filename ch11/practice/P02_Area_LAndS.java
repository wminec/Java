package ch11.practice;

public class P02_Area_LAndS {
	int num=0;
		
	public synchronized void increase(String tName){
		if(tName.equals("first")){
			for(int i=0; i<100;i++){
				num++;
				System.out.println(tName+":" + num);
				if(i==99){
					try{
						this.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}else{
					this.notify();
				}
			}
		}else if(tName.equals("second")){
			for(int i=0; i<70;i++){
				num++;
				System.out.println(tName+":" + num);
				if(i==69){
					try{
						this.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}else{
					this.notify();
				}
			}
		}else if(tName.equals("third")){
			for(int i=0; i<30;i++){
				num++;
				System.out.println(tName+":" + num);
				if(i==29){
					try{
						this.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}else{
					this.notify();
				}
			}
		}
	}
}
