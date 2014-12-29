package notebook

import com.esotericsoftware.kryo.Kryo
import org.apache.spark.serializer.KryoRegistrator

class HackDevKryoReg extends KryoRegistrator {
  override def registerClasses(kryo: Kryo) {
    kryo.register(classOf[scala.Option[_]])
    kryo.register(classOf[scala.Some[_]])
    kryo.register(scala.None.getClass)
  }
}