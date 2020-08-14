import { combineReducers } from 'redux';
import patientReducer from '../patient/reducer'
import consultationReducer from '../consultation/reducer'
const rootReducer = combineReducers({
  patientReducer,
  consultationReducer
});

export default rootReducer;