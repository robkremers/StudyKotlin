package classes

import kotlin.math.roundToInt

class TV(var height: Double, var width: Double) {

    // Read-Only property = Custom Getter
    var diagonal: Int
        get() {
            val result = Math.sqrt(height * height + width * width);
            return result.roundToInt();
        }
        // Read-Write property = Custom Setter: setting height, width and thereby diagonal.
        set(value) { // for diagonal!!!
            val ratioWidth = 16.0;
            val ratioHeight = 9.0;
            val ratioDiagonal = Math.sqrt(ratioHeight * ratioHeight + ratioWidth * ratioWidth);
            height = value.toDouble() * ratioHeight / ratioDiagonal;
            width = height * ratioWidth / ratioHeight;
        }

}