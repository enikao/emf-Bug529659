package example.validator;

import java.util.Map;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class ValidatorRegistrar {

	@Reference
	private IExtensionRegistry extensionRegistry;
	
	@Activate
	public void activate() {
		EValidator.Registry.INSTANCE.put(EXTLibraryPackage.eINSTANCE, new EValidator.Descriptor() {
			
			@Override
			public EValidator getEValidator() {
				return new EValidator() {
					
					@Override
					public boolean validate(EDataType eDataType, Object value, DiagnosticChain diagnostics,
							Map<Object, Object> context) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
						// TODO Auto-generated method stub
						return false;
					}
					
					@Override
					public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
						// TODO Auto-generated method stub
						return false;
					}
				};
			}
		});
	}
}
