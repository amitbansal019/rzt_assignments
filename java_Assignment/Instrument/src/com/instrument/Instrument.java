package com.instrument;

abstract class Instrument {
	abstract void play();
}
class Piano extends Instrument{
	
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Piano is playing  tan tan tan tan  ");
		
	}
	
}
class Flute extends Instrument{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Flute is playing  toot toot toot toot  ");
		
	}
	
}
class Guitar extends Instrument{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is playing  tin  tin  tin  ");
		
	}
	
}
class Test{
	public static void main(String args[]){
		Instrument[] i=new Instrument[11];
		i[1]=new Piano();
		i[2]=new Flute();
		i[3]=new Guitar();
		i[4]=new Piano();
		i[5]=new Flute();
		i[6]=new Guitar();
		i[7]=new Piano();
		i[8]=new Flute();
		i[9]=new Guitar();
		i[10]=new Piano();
		for(int m=1;m<11;m++){
			System.out.println("Index no : "+m);
			i[m].play();
		}
		
	} 
}








































