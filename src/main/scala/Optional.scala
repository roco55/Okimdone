package com.tkroman.kpi.y2022.l1


class Bubble(){
	def swap(arr: Array[Int], a: Int, b: Int): Unit = {
		var temp: Int = arr(a);
		arr(a) = arr(b);
		arr(b) = temp;
	}
	// main function of sorting
	def BubbleSort(arr: Array[Int], n: Int): Unit = {
		var i: Int = 0;
		while (i < n){
			var j: Int = 0;
			while (j < (n - 1) - i){
				if (arr(j) > arr(j + 1)){
					swap(arr, j, j + 1);
				}
				j += 1;
			}
			i += 1;
		}
	
	}
	def show(arr: Array[Int], n: Int): Unit = {
		var i: Int = 0;
		while (i < n){
			print("  " + arr(i));
			i += 1;
		}
		print("\n");
	}
}

object Main
{
	def main(args: Array[String]): Unit = {
		var task: Bubble = new Bubble();
		var arr: Array[Int] = Array(5, 5, 5, 3, -4, 15, -5, 1, -2, 11);
		var n: Int = arr.length;
		println("Before Sort :");
		task.show(arr, n);
		task.BubbleSort(arr, n);
		println("After Sort :");
		task.show(arr, n);
	}
}