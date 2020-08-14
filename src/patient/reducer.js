 import { SET_PATIENTS , GET_PATIENTS } from './actions';

const initialState = {
  patients: []
 ,
  fetching: false
}

const patientReducer = (state = initialState, action) => {
  switch (action.type) {
    case SET_PATIENTS:
      return {...state, patients: action.value,  fetching: false }
    case GET_PATIENTS:
      return { ...state, fetching: true }
    default: return state;
  }
}


export default patientReducer; 
