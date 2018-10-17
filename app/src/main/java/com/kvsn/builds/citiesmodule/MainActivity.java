package com.kvsn.builds.citiesmodule;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.app.Activity;
import android.widget.TextView;


public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener
{
    Spinner s, c;
    String []states;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.activity_main);

	   s=findViewById(R.id.statespinner);
	   c=findViewById(R.id.cityspinner);
	   states = getResources().getStringArray(R.array.states);

	   ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
			 this,android.R.layout.simple_spinner_item,states)
	   {
		  @Override
		  public boolean isEnabled(int position){
			 if(position == 0)
			 {
				// Disable the first item from Spinner
				// First item will be use for hint
				return false;
			 }
			 else
			 {
				return true;
			 }
		  }
		  @Override
		  public View getDropDownView(int position, View convertView,ViewGroup parent)
		  {
			 View view = super.getDropDownView(position, convertView, parent);
			 TextView tv = (TextView) view;
			 if(position == 0)
			 {
				// Set the hint text color gray
				tv.setTextColor(Color.GRAY);
			 }
			 else {
				tv.setTextColor(Color.BLACK);
			 }
			 return view;
		  }
	   };
	   spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
	   s.setAdapter(spinnerArrayAdapter);
	   s.setOnItemSelectedListener(this);

	   final ArrayAdapter<String> adap2;

    }


    public void andaman()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.andaman,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void andhra()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.andhrapradesh,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void arunachal()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.arunachalpradesh,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void assam()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.assam,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void bihar()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.bihar,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void chandigarh()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.chandigarh,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void chattisgarh()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.chattisgarh,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void dadra()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.dadranagarhaveli,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void daman()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.damandiu,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void delhi()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.Delhi,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void goa()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.Goa,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void gujarat()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.gujarat,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void haryana()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.haryana,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void himachal()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.himachal,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void jammu()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.jammu,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void jharkhand()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.jarkhand,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void karnataka()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.karnataka,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void kerala()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.kerala,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void lakshwadeep()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.lakshwadeep,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void madhyapradesh()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.madhyapradesh,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void maharashtra()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.maharashtra,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void manipur()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.manipur,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void meghalaya()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.meghalaya,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void mizoram()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.mizoram,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void nagaland()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.nagaland,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void orissa()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.orissa,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void pondicherry()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.pondicherry,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void punjab()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.Punjab,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void rajasthan()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.rajasthan,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void sikkim()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.sikkim,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void tamilnadu()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.tamilnadu,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void tripura()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.tripura,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void uttarpradesh()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.uttarpradesh,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void uttaranchal()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.uttaranchal,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    public void westbengal()
    {
	   ArrayAdapter<CharSequence> adap2= ArrayAdapter.createFromResource(this , R.array.westbengal,android.R.layout.simple_spinner_item);
	   adap2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	   c.setAdapter(adap2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent,View view,int position,long id)
    {
	   String s=parent.getSelectedItem().toString();
	   if(s.equals("Andaman and Nicobar Islands"))
	   {
		  andaman();
	   }
	   else if(s.equals("Andhra Pradesh"))
	   {
		  andhra();
	   }
	   else if(s.equals("Arunachal Pradesh"))
	   {
		  arunachal();
	   }
	   else if(s.equals("Assam"))
	   {
		  assam();
	   }
	   else if(s.equals("Bihar"))
	   {
		  bihar();
	   }
	   else if(s.equals("Chandigarh"))
	   {
	       chandigarh();
	   }
	   else if(s.equals("Chattisgarh"))
	   {
	       chattisgarh();
	   }
	   else if(s.equals("Darda and Nagar Haveli"))
	   {
	       dadra();
	   }
	   else if(s.equals("Daman and Diu"))
	   {
	       daman();
	   }
	   else if(s.equals("Delhi"))
	   {
	       delhi();
	   }
	   else if(s.equals("Goa"))
	   {
	       goa();
	   }
	   else if(s.equals("Gujart"))
	   {
	       gujarat();
	   }
	   else if(s.equals("Haryana"))
	   {
	       haryana();
	   }
	   else if(s.equals("Himachal Pradesh"))
	   {
	       himachal();
	   }
	   else if(s.equals("Jammu and Kashmir"))
	   {
	       jammu();
	   }
	   else if(s.equals("Jharkhand"))
	   {
	       jharkhand();
	   }
	   else if(s.equals("Karnataka"))
	   {
	       karnataka();
	   }
	   else if(s.equals("Kerala"))
	   {
	       kerala();
	   }
	   else if(s.equals("Lakshwadweep"))
	   {
	       lakshwadeep();
	   }
	   else if(s.equals("Madhya Pradesh"))
	   {
	       madhyapradesh();
	   }
	   else if(s.equals("Maharashtra"))
	   {
	       maharashtra();
	   }
	   else if( s.equals("Manipur"))
	   {
	       manipur();
	   }
	   else if(s.equals("Meghalaya"))
	   {
	       meghalaya();
	   }
	   else if(s.equals("Mizoram"))
	   {
	       mizoram();
	   }
	   else if(s.equals("Nagaland"))
	   {
	       nagaland();
	   }
	   else if(s.equals("Orissa"))
	   {
	       orissa();
	   }
	   else if(s.equals("Pondicherry"))
	   {
	       pondicherry();
	   }
	   else if(s.equals("Punjab"))
	   {
	       punjab();
	   }
	   else if(s.equals("Rajasthan"))
	   {
	       rajasthan();
	   }
	   else if(s.equals("Sikkim"))
	   {
	       sikkim();
	   }
	   else if(s.equals("Tamil Nadu"))
	   {
	       tamilnadu();
	   }
	   else if(s.equals("Tripura"))
	   {
	       tripura();
	   }
	   else if(s.equals("Uttar Pradesh"))
	   {
	       uttarpradesh();
	   }
	   else if(s.equals("Uttaranchal"))
	   {
	       uttaranchal();
	   }
	   else if(s.equals("West Bengal"))
	   {
	       westbengal();
	   }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }
}
