
# Circular Menu | android | kotlin

Menu which circular in shape with sub-menu items (with Animation included)

# Imports and Dependencies

1. JitPack repository (add to settings.gradle)

		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	
2. Dependencies (add to build.gradle)

   		 implementation 'com.github.Hitomis:CircleMenu:v1.1.0'
## XML uses

        <com.hitomi.cmlibrary.CircleMenu
        android:id="@+id/cmMain"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
## Activity uses
adding main menu :

        cmMain.setMainMenu(Color.parseColor("#000000"), R.drawable.ic_menu, R.drawable.ic_cancel)
    
Adding submenus :

        cmMain.addSubMenu(Color.parseColor("#00AF91"), R.drawable.ic_home)
        cmMain.addSubMenu(Color.parseColor("#007965"), R.drawable.ic_favourite)
        cmMain.addSubMenu(Color.parseColor("#F58634"), R.drawable.ic_contact)
        cmMain.addSubMenu(Color.parseColor("#FFCC29"), R.drawable.ic_info)

adding click listeners to menu items :

        cmMain.setOnMenuSelectedListener { it ->
            when (it) {
                0 -> Toast.makeText(this, "This is Home!", Toast.LENGTH_SHORT).show()

                1 -> Toast.makeText(this, "This is Favourite", Toast.LENGTH_SHORT).show()

                2 -> Toast.makeText(this, "This is Contact", Toast.LENGTH_SHORT).show()

                3 -> Toast.makeText(this, "This is About", Toast.LENGTH_SHORT).show()
            }
        }
    }
## Methods


| `setMainMenu` | `Set the background color of the main menu, and open/close icons  Params:mainMenuColor-main menu background color, openMenuRes-menu open icon, Resource format, closeMenuRes-Menu close icon, Resource format` |  |
| :-------- | :------- | :------------------------- |
| `addSubMenu` | `Add a sub-menu item, including the background color and icon of the sub-menu  Params: menuColor-the background color of the submenu ,menuRes-submenu icon, Resource format` |  
| `setOnMenuSelectedListener` | `Set the listener for the selected submenu item, the callback method will pass the subscript value of the currently clicked submenu item, starting from 0` |


## Inspired From

[Hitomis Circle menu](https://github.com/Hitomis/CircleMenu)

## Author

- [@Jayesh Shinde](https://github.com/jayesh2272001)
