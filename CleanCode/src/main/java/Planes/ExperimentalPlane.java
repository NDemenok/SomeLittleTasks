package Planes;

import java.util.Objects;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance,
    							int maxLoadCapacity, ExperimentalTypes experimentalTypes,
    							ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

	public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getExperimentalTypes() {
		return experimentalTypes;
	}

	public void setExperimentalTypes(ExperimentalTypes experimentalTypes) {
		this.experimentalTypes = experimentalTypes;
	}

    @Override
    public boolean equals(Object object) {
    	 if (this == object) return true;
         if (!(object instanceof ExperimentalPlane)) return false;
         if (!super.equals(object)) return false;
         ExperimentalPlane experimentalPlane = (ExperimentalPlane) object;
         return  experimentalTypes == experimentalPlane.experimentalTypes &&
        		 classificationLevel == experimentalPlane.classificationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalTypes, classificationLevel);
    }

    @Override
    public String toString() {
    	 return super.toString().replace("}",
                 ", experimentalTypes=" + experimentalTypes + 
                 ", classificationLevel" + classificationLevel +
                 '}');
    }
}
