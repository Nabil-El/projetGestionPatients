import { GET_CONSULTATIONS , SET_CONSULTATIONS } from './actions';
const initialState = {
  
  consultations:[]
  ,
  fetching: false
}

const consultationReducer = (state = initialState, action) => {
  switch (action.type) {
    case SET_CONSULTATIONS:
      return {...state, consultations: action.value,  fetching: false }
    case GET_CONSULTATIONS:
      return { ...state, fetching: true }
    default: return state;
  }
}


export default consultationReducer;