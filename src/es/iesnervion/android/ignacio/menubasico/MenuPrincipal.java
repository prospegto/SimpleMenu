package es.iesnervion.android.ignacio.menubasico;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MenuPrincipal extends Activity {
	
	TextView lblMensaje;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);
		lblMensaje = (TextView) findViewById(R.id.lblMensaje);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_principal, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.mnOp1:
	            lblMensaje.setText("Opcion 1 pulsada");
	            return true;
	        case R.id.mnOp2:
	            lblMensaje.setText("Opcion 2 pulsada");;
	            return true;
	        case R.id.mnOp3:
	            lblMensaje.setText("Opcion 3 pulsada");;
	            return true;
	        case R.id.submnOp1:
	        	 lblMensaje.setText("Opcion 2.1 pulsada");;
		            return true;
	        case R.id.submnOp2:
	        	 lblMensaje.setText("Opcion 2.2 pulsada");;
		            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

}
