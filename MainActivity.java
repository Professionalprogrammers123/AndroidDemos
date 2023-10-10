package com.bainari.rxbindings;

import android.app.*;
import android.os.*;
import android.widget.*;
import com.jakewharton.rxbinding2.view.*;
import io.reactivex.*;
import io.reactivex.disposables.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		final Button btn=findViewById(R.id.mainButton);
		RxView.clicks(btn)
		  .subscribe(new Observer<Object>(){
			  
			  @Override
			  public void onSubscribe(Disposable d){
				  

				/*  Toast.makeText(MainActivity.this,"Rxview clicks on button",
								 Toast.LENGTH_SHORT).show(); */
			  }
			  
			  @Override
			  public void onNext(Object obj){
				  
				  

				  Toast.makeText(MainActivity.this,"Rxview clicks on button",
								 Toast.LENGTH_SHORT).show();
			  }
			  
			  @Override 
			  public void onError(Throwable t){
				  
			  }
			  @Override
			  public void onComplete(){
				  
			  }
			  
		  });
    }
}
