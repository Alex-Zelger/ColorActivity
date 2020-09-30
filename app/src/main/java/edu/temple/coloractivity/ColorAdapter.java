package edu.temple.coloractivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {


    Context context;
    String[] colors;
    LayoutInflater inflater;

    public ColorAdapter(Context applicationContext, String[] colors) {
        super();
        this.context = applicationContext;
        this.colors = colors;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.coloradapter_view_layout, viewGroup,false);
        TextView color = (TextView) view.findViewById(R.id.textView);
        color.setText(colors[i]);
        //color.setBackgroundColor(Color.parseColor(colors[i]));

        String chosenColor = colors[i];
        //Set Background color
        if(chosenColor.equals("Red")){
            color.setBackgroundColor(Color.RED);
        }
        if(chosenColor.equals("Blue")){
            color.setBackgroundColor(Color.BLUE);
        }
        if(chosenColor.equals("Black")){
            color.setBackgroundColor(Color.BLACK);
        }
        if(chosenColor.equals("Cyan")){
            color.setBackgroundColor(Color.CYAN);
        }
        if(chosenColor.equals("Green")){
            color.setBackgroundColor(Color.GREEN);
        }
        if(chosenColor.equals("LTGray")){
            color.setBackgroundColor(Color.LTGRAY);
        }
        if(chosenColor.equals("DKGray")){
            color.setBackgroundColor(Color.DKGRAY);
        }
        if(chosenColor.equals("Magenta")){
            color.setBackgroundColor(Color.MAGENTA);
        }
        if(chosenColor.equals("White")){
            color.setBackgroundColor(Color.WHITE);
        }
        if(chosenColor.equals("Yellow")){
            color.setBackgroundColor(Color.YELLOW);
        }

        return view;
    }

}
