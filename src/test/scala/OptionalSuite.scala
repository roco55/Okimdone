import org.scalatest.funsuite.AnyFunSuite
import com.tkroman.kpi.y2022.l1._

var task: Bubble = new Bubble(); // just needed


class BubbleTest extends AnyFunSuite {

  test("1"){
    var arr: Array[Int] = Array(1, 2, 3, 4, 5, 6);
    var n: Int = arr.length;
    task.BubbleSort(arr, n);
    assert(task.show(arr, n) === task.show(Array(1, 2, 3, 4, 5, 6), 6))
  }

  test("2"){
    var arr: Array[Int] = Array(6, 5, 4, 3, 2, 1);
    var n: Int = arr.length;
    task.BubbleSort(arr, n);
    assert(task.show(arr, n) === task.show(Array(1, 2, 3, 4, 5, 6), 6))
  }

  test("3"){
    var arr: Array[Int] = Array(3, 2, 1, -1, -2, -3);
    var n: Int = arr.length;
    task.BubbleSort(arr, n);
    assert(task.show(arr, n) === task.show(Array(-3, -2, -1, 1, 2, 3), 6))
  }

  test("4"){
    var arr: Array[Int] = Array( 10, 10, 10, -10, -10, -10);
    var n: Int = arr.length;
    task.BubbleSort(arr, n);
    assert(task.show(arr, n) === task.show(Array(-10, -10, -10, 10, 10, 10), 6))
  }

  test("5"){
    var arr: Array[Int] = Array(9, 7, 2, 3, 4, 1, 8, 2, 10, 5, 6);
    var n: Int = arr.length;
    task.BubbleSort(arr, n);
    assert(task.show(arr, n) === task.show(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 10))
  }

}
