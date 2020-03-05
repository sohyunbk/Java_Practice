//int Channel; // current+channel 1-120
 //int VolumeLevel; //1-7
 //boolean on; // indicates whether TV is on or off
 // Three states 
 //( Make objects...?) 
 // turnOn() , turnOff(), Set Channel (int newChannel), Set volume(int Volumnelevel)
 // ChannelUp() , ChannelDown(), VolumeUp(), VolumeDown()
 
public class Exercise_Channel {
  /** Main method */
  public static void main(String[] args) {
    // Create a circle with radius 1
    TV TV1 = new TV(); // circle1 이 object 라고 할 수 있음.
     TV1.ChannelUp();
  }}
  
class TV {
	 int Channel; // current+channel 1-120
	 int VolumeLevel; //1-7
	 boolean on;

	  TV() {
	    on = false;
	    Channel = 1;
	    VolumeLevel = 1;
	  }
	  TV(boolean Choice, int nChannel, int nVolumeLevel) {
	    on = Choice;
	    Channel = nChannel;
	    VolumeLevel = nVolumeLevel;
	  }

	  /** Return the area of this circle */
	  void TurnOn() {
         on = true;
	  }
	  
      void ChannelUp() {
		 Channel ++;
      }
	  /** Set a new radius for this circle */
	  

	}
